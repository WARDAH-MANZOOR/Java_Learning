package com.company.chapter2;

public class Chapter2PracticeSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER 2 ");

        System.out.println("QUESTION # 01 : What will be the result of the following expression/; float a = 7 /4 * 9/2");
        int a = 7/4 * 9/2; // agr hum is expression ko khud se solve karen java ke rules ke mutabiq  pehle 7/4= 1.75 phr
        // 9/2 = 4.5 phr multiply 1.75 * 1.75 = 7.875 aaiga
        // par java isko aese solve nahi karta humne datatypes wale concept me dekha tah ke int aur int ke darmyan ka jo
        // operation hota hai wo int hi deta hai tou ye siatrah karega ke 7 bhi int hai aur 4 bhi tou 7/4 ka ans float aya 1.75 par
        // ye int consider hoga aur 1 banjaaiga is hi tarah 9/ 4 ye dono bhi integer hain inkod ivide karne par 4.5 ata hai par ye
        // bhi Int banjaaiga aur 4 hoga phr dono multiple honge tou answer 4 aaiga
        System.out.println(a);

        System.out.println("QUESTION # 02 : Write a program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade");
        // Encrypt
        char grade = 'C';
        grade = (char)(grade+8);
        System.out.println(grade);
        // Decrypt
        grade = (char)(grade-8);
        System.out.println(grade);



    }
}
