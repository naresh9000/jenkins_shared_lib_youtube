def call() {
    sh 'trivy image dockernaresh2023/youtube1:latest > trivyimage.txt'
}