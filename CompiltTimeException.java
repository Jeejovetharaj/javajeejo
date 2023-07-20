public class CompiltTimeException {
    public static void main(String[] args) throws IOException, InterruptedException
    {
        Runtime run=Runtime.getRuntime();

        Process pro;

        pro=run.exec("notepad");
        Thread.sleep(8000);
        pro=run.exec("calc");

    }
}
