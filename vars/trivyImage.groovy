def call() {
    sh 'trivy image youtube:latest > trivyimage.txt'
}