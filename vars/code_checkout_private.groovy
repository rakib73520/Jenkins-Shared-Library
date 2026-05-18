/**
 * Custom Shared Library function to clone a private GitHub repository
 * using a saved Jenkins Credential Token.
 * * @param GitUrl       The HTTPS link to your GitHub repository
 * @param GitBranch    The branch name to checkout (e.g., 'main')
 * @param CredentialId The Jenkins Credentials ID containing your GitHub PAT/Username
 */
def call(String GitUrl, String GitBranch, String CredentialId) {
    echo "Cloning private repository: ${GitUrl} on branch: ${GitBranch} using credentials: ${CredentialId}"
    
    git url: "${GitUrl}", 
        branch: "${GitBranch}", 
        credentialsId: "${CredentialId}"
}
