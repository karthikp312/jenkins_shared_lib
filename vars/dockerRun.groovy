def call(String Image){
    
    sh """
     docker run -i -d ${Image}
    """
}
