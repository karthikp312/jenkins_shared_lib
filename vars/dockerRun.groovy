def call(String Image){
    
    sh """
     docker login -u karthik312 -p Wwwraw312@
     docker run -i -d ${Image}
    """
}
