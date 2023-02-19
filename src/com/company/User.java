package com.company;

public class User {

    private int rank;
    private int progress;
    User(){
        this.progress = 0;
        this.rank = -8;
    }
    void incProgress(int n)
    {
        if (rank>8||rank<-8||rank==0) throw new IllegalArgumentException();
        if (this.rank==8) {progress=0;return;}

        int d=(rank>0?rank+7:rank+8)-(this.rank>0?this.rank+7:this.rank+8);

        int add = 0;
        if (d<=-2) add=0;
        else if (d==-1) add=1;
        else if(d==0) add=3;
        else add=10*d*d;
        progress+=add;
        while (progress>=100&&this.rank<8) {
            this.rank=this.rank==-1?1:++this.rank;
            progress-=100;
            if (this.rank==8) progress=0;
        }

    }

}
