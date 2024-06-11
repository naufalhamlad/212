import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class Main implements CollectionTest {
    int size;
    ArrayList<Person> arrayList;
    LinkedList<Person> linkedList;
    HashMap<Integer, Person> hashMap;

    public Main() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
        this.hashMap = new HashMap<>();
    }

    public void Add() {
        for (int i = 0; i < size; i++) {
            String u = Integer.toString(i);
            Person p = new Person("Person" + u, i);
            arrayList.add(p);
        }
    }

    public void Index() {
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
    }
    
    public void Search(){
        int index = size/2;
        Person p = arrayList.get(index);
    }

    public void Addll() {
        for (int i = 0; i < size; i++) {
            String u = Integer.toString(i);
            Person p = new Person("Person" + u, i);
            linkedList.add(p);
        }
    }

    public void Indexll() {
        for (int i = 0; i < size; i++) {
            linkedList.get(i);
        }
    }

    public void Searchll(){

        int i = size/2;
        Person p = linkedList.get(i);
    }

    public void Addhm() {
        for (int i = 0; i < size; i++) {
            String u = Integer.toString(i);
            Person p = new Person("Person" + u, i);
            hashMap.put(i, p);
        }
    }

    public void Indexhm() {
        for (int i = 0; i < size; i++) {
            Person p = hashMap.get(i);
        }
    }

    public void Searchhm(){

        int k = size/2;
        Person p = hashMap.get(k);
    }
    

    public void setSize(int size) {
        this.size = size;
    }

    public void runTest(CollectionType type, TestType test, int iterations) {
        if (type == CollectionType.ARRAY_LIST && test == TestType.ADD) {
            for (int i = 0; i < iterations; i++) {
                Add();
            }
        } else if (type == CollectionType.ARRAY_LIST && test == TestType.INDEX) {
            for (int i = 0; i < iterations; i++) {
                Index();
            }
        } else if (type == CollectionType.LINKED_LIST && test == TestType.ADD) {
            for (int i = 0; i < iterations; i++) {
                Addll();
            }
        } else if (type == CollectionType.LINKED_LIST && test == TestType.INDEX) {
            for (int i = 0; i < iterations; i++) {
                Indexll();
            }
        } else if (type == CollectionType.HASH_MAP && test == TestType.ADD) {
            for (int i = 0; i < iterations; i++) {
                Addhm();
            }
        } else if (type == CollectionType.HASH_MAP && test == TestType.INDEX) {
            for (int i = 0; i < iterations; i++) {
                Indexhm();
            }
        }else if (type == CollectionType.HASH_MAP && test == TestType.SEARCH) {
            for (int i = 0; i < iterations; i++) {
                Searchhm();
            }
        }
    }   
}

