interface EventHandler {
    void handleEvent();
}

class EventSystem {
    public void registerEvent() {
        class LocalInnerClass implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        
        EventHandler localHandler = new LocalInnerClass();
        localHandler.handleEvent();
    }

    public static void main(String[] args) {
        EventSystem system = new EventSystem();
        
        system.registerEvent();
        
        EventHandler anonymousInnerClass= new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        anonymousInnerClass.handleEvent();
    }
}
