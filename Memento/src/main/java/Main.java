public class Main {
    public static void main(String[] args) {
        Server server=new Server();
        server.setVersion("1.0");
        RepoSave repoSave=new RepoSave();
        repoSave.setSaveConfig(server.saveConfig());
        System.out.println(server.toString());
        server.setVersion("1.2");
        System.out.println(server.toString());
        server.loadVersion(repoSave.getSaveConfig());
        System.out.println(server.toString());


    }
}
