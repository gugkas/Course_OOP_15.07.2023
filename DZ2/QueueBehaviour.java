package DZ2;

public interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    int size();
}
