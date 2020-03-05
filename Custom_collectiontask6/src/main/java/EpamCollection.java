public class EpamCollection {
    //To make array list  grow  up to infinite
    private Object[] objArray=new Object[10];
    private int elementcount=0;
    //creating array with minimum capacity.
    public void add(Object obj){
        if(elementcount==objArray.length){
            increaseCapacity(); //to increase the capacity of the array if reached length
        }
        objArray[elementcount]=obj;
        elementcount++;
    }
    public void increaseCapacity(){
        int newCapacity= objArray.length*2;
        Object[] nextArray=new Object[newCapacity];
        //copying old list to new list
        for(int i=0;i<objArray.length;i++){
            nextArray[i]=objArray[i];
        }
        objArray=nextArray;
    }
    public void remove()
    {
        if(elementcount==0)
        {
            System.out.println("List is empty,Cannot delete the elements...");
        }
        else {
            Object r=objArray[elementcount-1];
            System.out.println("\nRemoved element is "+ r);
            objArray[elementcount-1]=null;
            elementcount--;
        }
    }
    public void printList() {
            for(Object obj1:objArray)
                if(obj1==null)
                    break;
                else
                    System.out.print(obj1+" ");
            System.out.println();
    }
    public String toString() {
        if (elementcount == 0)
            return "[ ]";
        else {
            String res = "[ ";
            for (Object obj1 : objArray)
                if (obj1 == null)
                    break;
                else
                    res += obj1 + " , ";

            res = res.substring(0, res.length() - 2);

            res += "]\n";
            return res;
        }
    }
    public Object get(int index){
        if(index<0||index>=elementcount){
            throw new IndexOutOfBoundsException(""+index);
        }
        return  objArray;
    }
    }
