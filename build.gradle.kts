delegateTasksToApps("assemble", "build", "classes", "clean", "testClasses", "bootJar", "javadoc", "check", "test")

fun delegateTasksToApps(vararg taskIds: String) {
    taskIds.forEach { taskId ->
        val pwd = gradle.rootProject.projectDir
        val apps = gradle.includedBuilds
                .filter {
                    val relative = it.projectDir.toRelativeString(pwd)
                    relative.startsWith("apps${File.separator}")
                }
        tasks.register(taskId) {
            group = "delegate"
            dependsOn(apps.map { it.task(":$taskId") })
        }
    }
}
