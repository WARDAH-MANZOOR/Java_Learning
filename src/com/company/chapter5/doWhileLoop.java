package com.company.chapter5;
// whilw loop - pehle condition check karta hai phr code chalata hai
// do while loop- pehle print karta hai phr cndition check karta hai matlab ye ke example ke tor par i = 11 ho aur do
// while laga ahi ke while me condition hai i<=10 tou us case me tou ye hai ke i humare paas 11 hai tou condition ke
// hisab se ye chalna hi nahi chhaiye simple while loop me ye nahi chalta , par d while me kia hota ahi ke i =11 ahi aur
// agr humne dowhile me usko print karwaya ahi aur phr increment kia hai tou wo chalega uske baad consition match hogi ,
// matlab ye ke 11 print hua increment hua i++ se jisse wo 12 hogaya phr wile ke paas gaya condition dekhi ke ye tou srf
// 1 tak hosakta ahi tou phr loop agay anhic halega aur close hojaiga, simple wale while loop me pehle hi condition check
// hojati hai aur phr kuch na print hota na increment
public class doWhileLoop {
    public static void main(String[] args) {
        int i = 11;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
