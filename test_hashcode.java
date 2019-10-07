class parent {

 parent()
{
System.out.println(this.hashCode());

}

}

class child extends parent{
child()
{
System.out.println(this.hashCode());
}

}


class test_hashcode
{
public static void main(String[] args)
   {
   
   child c= new child();
   System.out.println(c.hashCode());
   
   }

} 