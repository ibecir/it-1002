package ba.edu.ibu.week11.livesession.groupa;

import java.util.Iterator;

class OddNumbersIterator implements Iterator<Integer> {
    private int[] elements;
    private int index;

    public OddNumbersIterator(int[] elements) {
        this.elements = elements;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < elements.length && elements[index] % 2 == 0)
            index++;
        return index < elements.length;
    }

    @Override
    public Integer next() {
        if(hasNext())
            return elements[index++];
        return -1;
    }
}

class MainRun {
    static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6,7,8,9898989,212,2,3,1,45465, 9};
        OddNumbersIterator iterator = new OddNumbersIterator(elements);
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

