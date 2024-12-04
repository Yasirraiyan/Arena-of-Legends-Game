public class Contestant
{
    public String name;
    public int age;
    public String status;
    public boolean attack=false;
    public int point;
    public int life;
    public int x;
    public int y;
    public int z;
    public int turn;
    public int star;
    public Contestant(String name,int age,String status,boolean attack,int point,int life,int x,int y,int z,int turn,int star)
    {
        this.name=name;
        this.status=status;
        this.attack=attack;
        this.point=point;
        this.life=life;
        this.x=x;
        this.y=y;
        this.z=z;
        this.turn=turn;
        this.star=star;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public String getstatus()
    {
        return status;
    }
    public (int,int) getpositionin2d(int x,int y)
    {
        if(x==0&&y==0)
        {
            System.out.println($"The position of the contestant is in center.And it is:" (+x+","+y));
        }
         if(x==0&&y>0)
        {
            System.out.println($"The position of the contestant is in positive direction of y-axis.And it is:" (+x+","+y));
        }
         if(x>0&&y==0)
        {
            System.out.println($"The position of the contestant is in positive direction of x-axis.And it is:" (+x+","+y));
        }
        if(x>0&&y>0)
        {
            System.out.println($"The position of the contestant is in 1st quadrent.And it is:" (+x+","+y));
        }
        if(x<0&&y>0)
        {
            System.out.println($"The position of the contestant is in 2nd quadrent.And it is:" (+x+","+y));
        }
        if(x<0&&y==0)
        {
            System.out.println($"The position of the contestant is in negative direction of x-axis.And it is:" (+x+","+y));
        }
        if(x<0&&y<0)
        {
            System.out.println($"The position of the contestant is in 3rd quadrent.And it is:" (+x+","+y));
        }
        if(x==0&&y<0)
        {
            System.out.println($"The position of the contestant is in negative direction of y-axis.It is lies on y-axis. And it is:" +(x+","+y));
        }
            if(x>0&&y<0)
        {
            System.out.println($"The position of the contestant is in 4th quadrent.And it is:" +(x+","+y));
        }
        return (x,y);
        }
        public (int,int,int) getpositionin3d(int x,int y,int z)
        {
             System.out.println($"The position of the contestant is in 3-d is:" +(x+","+y+","+z));
             return (x,y,z);
        }
        public (int,int,boolean,int) survive(int point,int life,boolean attack,int turn)
        {
            if(!attack)
            {
                while(life>0)
                {
                    point-=1;
                    
                }
                life--;
                turn--;
            }
            if(life==0&&!attack&&turn==0)
            {
                System.out.println("The Contestent is not survive.The present life of contestent is 0");
            }
            return (point,life,attack,turn);
        }
        public (String,int,int,int) getsoldiercatagory(String status,int life,int turn,int star)
        {
            if(life==100&&turn==5&&star>10)
            {
                status="general";
                System.out.println("The soldier is:"+status);
            }
            if(life>80&&turn==4&&star>9)
            {
                status="general2";
                System.out.println("The soldier is:"+status);
            }
            if(life>60&&turn==3&&star>8)
            {
                status="Lt-general";
                System.out.println("The soldier is:"+status);
            }
            if(life>40&&turn==2&&star>7)
            {
                status="Major general";
                System.out.println("The soldier is:"+status);
            }
            if(life>35&&turn==2&&star>6)
            {
                status="Brig.general";
                System.out.println("The soldier is:"+status);
            }
            if(life>30&&turn==2&&star>5)
            {
                status="Colonel";
                System.out.println("The soldier is:"+status);
            }
            if(life>25&&turn==2&&star>4)
            {
                status="Lt-colonel";
                System.out.println("The soldier is:"+status);
            }
            if(life>20&&turn==2&&star>3)
            {
                status="major";
                System.out.println("The soldier is:"+status);
            }
            if(life>15&&turn==2&&star>2)
            {
                status="Captain";
                System.out.println("The soldier is:"+status);
            }
            if(life>10&turn==2&&star>1)
            {
                status="1st-lt";
                System.out.println("The soldier is:"+status);
            }
            if(life>5&&turn==2&&star>0&&star<1)
            {
                status="2nd-lt";
                System.out.println("The soldier is:"+status);
            }
          return(status,life,turn,star);
        }
    }
}
