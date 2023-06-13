def call(String project, String ImageTag, String hubUser){
    
    sh """
     aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/i7v7j6w5
     docker image build -t ${hubUser}/${project}:latest .
     docker push public.ecr.aws/i7v7j6w5/${params.ImageName}:${params.ImageTag}
     
    """
}
