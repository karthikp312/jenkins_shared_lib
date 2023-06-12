def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    //sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker run -d -p 8083:8086 ${hubUser}/${project}:latest"   
}
