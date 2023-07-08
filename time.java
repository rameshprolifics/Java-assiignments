class Time{
    int H;
    int M;
    int S;

    public Time(){}

    public Time( int h,int m,int s){
    this.H=h;
    this.M=m;
    this.S=s;
    }

    public int validateHours(int h){
    return (h>=0 && h<=23)?  h : 2;
    }

    public void setHours(int h){
        H=validateHours(h);
    }

    public int getHours(){
    return H;
    }

    public int validateMinutes(int m){
        return (m>=0 && m<=59)?  m : 2;
    }

    public void setMinutes(int m){
       M=validateMinutes(m);
    }

    public int getMinutes(){
    return M;
    }

    public int validateSeconds(int s){
    return (s>=0 && s<=59)?  s : 2;
    }

    public void setSeconds(int s){
    S=validateSeconds(s);
    }

    public int getSeconds(){
    return S;
    }

    public void display(){

        //while(true){
            // System.out.println("h");
         System.out.println(H+" "+M+" "+S);
            if(S>=0 && S<=59){
                S++;
            }
                else if(S==60){
                    S=0;

                    if(M>=0 && M<=59){
                        M++;

                    }
                    else if(M==60){
                    M=0;

                        if(H>=0 && H<=23){
                        H++;
                        }
                        else if(H==24){
                            H=0;
                        }
                    }

                }
         }
    }
}

class Main{
    public static void main(String[] args){
        Time t=new Time();
        t.setHours(22);
        t.setMinutes(50);
        t.setSeconds(40);
        t.display();

    }
}
