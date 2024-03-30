def call() {
    sh 'trivy image dockernaresh2023/youtube:latest > trivyimage.txt'
}