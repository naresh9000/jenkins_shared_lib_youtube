def call() {
    sh 'trivy image naresh/my-youtube:latest > trivyimage.txt'
}