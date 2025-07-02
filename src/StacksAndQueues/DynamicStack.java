package StacksAndQueues;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
//  it will call parent default constructor
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
//        this takes care of it being full
        if (this.isFull()) {
//double the array size
            int[] temp = new int[data.length * 2];
//           copy all data from old to new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
//        at this time we know that array is not full
//        insert item
        return super.push(item);
    }
}
