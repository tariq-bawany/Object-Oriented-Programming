package Inheritance.StreamZone_Subscription_Plan;

public class User {
    private String username;
    private String email;
    private String[] watchHistory = new String[10];
    private int watchCount=0;

    public void setUsername(String username) {
        if(username==null || username.trim().isEmpty()) {
            this.username ="UNKNOWN";
            return;
        }
        String[] splits = username.trim().split("\\s+");
        StringBuilder sb =new StringBuilder();
        for(String s:splits){
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
        }
        this.username = sb.toString().trim();
    }

    public void setEmail(String email) {
        if(email.contains("@") && email.contains(".")){
            this.email = email;
        }else this.email = "invalid@email.com";
    }
    public void addToHistory(String title){
        if(this.watchCount<10){
            watchHistory[watchCount] = title;
            watchCount++;
        }else{
            System.out.println("Watch History full");
        }
    }

    public void watchMovie(String title){
        System.out.println("Playing "+title+" in 480p. [AD] Ads are playing...");
        addToHistory(title);
    }

    public void showWatchHistory(){
        if(watchCount>0 && watchCount<10){
            for(int i =0;i<watchCount;i++){
                if(watchHistory[i]!=null)System.out.println(i+"- "+watchHistory[i]);
            }
        }
    }

    public void searchHistory(String keyword){
        if(!keyword.isEmpty()){
            boolean isFound =false;
            for(int i =0;i<watchCount;i++){
                if(watchHistory[i].contains(keyword) && watchHistory[i]!=null){
                    System.out.println(watchHistory[i]);
                    isFound =true;
                }
            }
            if(!isFound) System.out.println("No history found");
        }
    }

    public String getUsername() {
        return username;
    }
}
