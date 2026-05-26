def call(String project_dir) {
    dir("${project_dir}/src") {
        sh 'docker compose build'
    }
}
