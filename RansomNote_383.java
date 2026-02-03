public class RansomNote_383 {
    
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for(char m : magazine.toCharArray()){
            // arr[m-> a - 'a'] means asci value arr[0]++
            arr[m - 'a']++;
        }

        for(char r : ransomNote.toCharArray()){
            // arr[m-> a - 'a'] means asci value arr[0]++
            if (arr [r-'a'] == 0) return false;
            arr[r - 'a']--;
        }


          return true ;


    }

    public static void main(String[] args) {
        String ransomNote = "alfjfgja";
        String magazine = "alfjfsdfgthsggja";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}


// So, What we doing here is... First we will initialize an array of alphabets counter.
// Let's initialize with the size 24. noo... Its 26, you forgot the number of alphabets in English?
// Jokes Apart..

// Now we loop through the entire String of magazine where char c stores the char at the index of magazine..

// You might think why I typed c-'a'
// It is because in ascii if you subtract any char with 'a' , it gives you index of that alphabet.
// Still confused?
// Let us assume a = 0 and z = 25. Now subtract a - a. You got 0 in ASCII, right?
// now subtract d-a, in ASCII it is 100-97, it leaves you with 3. Isn't that the index of that character in our alphabet counter and isn't that the fact the a=0, b=1, c=2 and d=3. Got it?

// Now we increment the counter for that character of its own index according to English Alphabets (Obviously)

// We have our counter ready!

// Now we run another for loop for ransomNote.
// Remember: if the charachter doesn't exists in magazine for ransomNote, we return false;
// or if it does exists, we decrement the counter of that charachter from its own index.

// lastly if nothing goes wrong (we have sufficient amount of charachters to make ransomNote)

// Return true :)