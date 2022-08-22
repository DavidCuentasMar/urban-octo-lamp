public class CustomEvent {
    String Id;
    String userId;
    Enum<?> platformEventType;

    public CustomEvent(String id, String userId, Enum<?> platformEventType){
        this.Id = id;
        this.userId = userId;
        this.platformEventType = platformEventType;
    }
}
