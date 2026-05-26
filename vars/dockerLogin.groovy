def call (String CredentialsID, Strng PROJECT_DIR) {
    withCredentials([usernamePassword(credentialsId: "${CredentialsID}", passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker login -u ${USER} -p ${PASS}"
        dir("${PROJECT_DIR}/src") {
            sh 'docker compose push'
        }
    }
}