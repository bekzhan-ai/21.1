class ObjectClone  implements Cloneable{

    ObjectClone () {
    }

    ObjectClone (boolean clone) {
        this.clone = clone;
    }

    public void setClone(boolean clone) {
        this.clone = clone;
    }

    boolean clone;



    @Override
    public ObjectClone  clone() throws CloneNotSupportedException {
        return (ObjectClone) super.clone();
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone test = new ObjectClone (false);
        ObjectClone clonedTest = test.clone();

        System.out.println("клон: "+clonedTest.clone);
        System.out.println("оригинал: "+test.clone);

        System.out.println("--------------");

        test.setClone(true);

        System.out.println("клон: "+clonedTest.clone);
        System.out.println("оригинал: "+test.clone);

        //нужен для клонирования объектов
    }
}
