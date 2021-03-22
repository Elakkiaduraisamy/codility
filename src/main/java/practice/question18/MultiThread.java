//public class MultiThread {
//
//    public static void main(String[] args) {
//        final String r1 = "java";
//        final String r2 = "resources";
//        Thread t1 = new Thread() {
//            public void run() {
//                synchronized (r1) {
//                    System.out.println("Thread 1: Locked r1");
//                    try {
//                        Thread.sleep(100);
//                    } catch (exception | InterruptedException e) {
//                    }
//                    synchronized (r2) {
//                        System.out.println("Thread 1: Locked r2");
//                    }
//                }
//            }
//        };
//        Thread t2 = new Thread() {
//            public void run() {
//                synchronized (r1) {
//                    System.out.println("Thread 2: Locked r1");
//                    try {
//                        Thread.sleep(100);
//                    } catch (Exception e){InterruptedException e}
//                    synchronized (r2) {
//                        System.out.println("Thread 2: Locked r2");
//                    }
//                }
//            }
//        };
//    }
//}
//
