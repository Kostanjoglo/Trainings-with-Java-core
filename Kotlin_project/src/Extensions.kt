val String.isPalindrome :Boolean
    get(){
        return this.toLowerCase().reversed() == this.toLowerCase()
    }