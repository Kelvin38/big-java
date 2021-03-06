package e_22_06_array_list;

public class AddLastRunnable implements Runnable {

    private static final int DELAY = 1;
    private ArrayList arrayList;
    private int count;

    public AddLastRunnable(final ArrayList arrayList, final int count) {
        this.arrayList = arrayList;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                Object o = i;
                arrayList.addLast(o);
                System.out.println("last   " + arrayList.toString());
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
