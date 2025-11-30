public class prime_number_summation{

    public static void main(String[] args) {

        int inp = 5;
        
        int sumfound = 0;
        int found = 0;
        boolean prime = false;
        boolean fin = false;
        int trial = 1;
        while (fin==false){
                int g = 0;
                trial++;
                for (int c = 2; c<(trial); c++)
                {
                    if(trial%c == 0){
                        g+=1;
                    }

                }
                if (g==0){
                    prime = true;
                    found+=1;
                    sumfound +=trial;
                }

                if(found==inp){
                    fin = true;
                    System.out.println(found+"  "+ sumfound);
                }

        }
    }
}