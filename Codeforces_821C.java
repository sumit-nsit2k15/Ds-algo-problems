import java.util.Scanner;

/*
 * http://codeforces.com/problemset/problem/821/C
 * Created by sumit on 2/7/17.
 */


public class Codeforces_821C {


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] stack=new int[n];
        int iter=0;
        int queries=2*n;
        int reorders=0;
        int toRemove=1;
        while(queries-->0){
            String query=sc.next();
            if(query.equals("add")){
                int num=sc.nextInt();
                stack[iter++]=num;
            }else{
                if(stack[iter-1]==-1) {
                    toRemove++;
                    continue;
                }
                if(stack[iter-1]==toRemove){
                    iter--;
                }else{
                    reorders++;
                    stack[iter-1]=-1;
                }
                toRemove++;
            }
        }
        System.out.println(reorders);
    }

}
