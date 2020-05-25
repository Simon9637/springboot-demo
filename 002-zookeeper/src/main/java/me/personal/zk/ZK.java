package me.personal.zk;

import org.apache.zookeeper.*;

import java.io.IOException;

public class ZK {
    private static final int SESSION_TIMEOUT = 30 * 1000;
    private static ZooKeeper zk;
    // 创建 Watcher 实例
    private static Watcher wh = new Watcher() {
        /**
         * Watched事件
         */
        public void process(WatchedEvent event) {
            System.out.println("WatchedEvent >>> " + event.toString());
        }
    };

    static {
        try {
            zk = new ZooKeeper("127.0.0.1:2181,127.0.0.1:2182,127.0.0.1:2183", SESSION_TIMEOUT, wh);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createNode() throws KeeperException, InterruptedException {
        System.out.println();
        zk.create("/path1", "data1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    public static void createChildNode() throws KeeperException, InterruptedException {
        zk.create("/path1/child1", "childData1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    public static String getNodeData() throws KeeperException, InterruptedException {
        return new String(zk.getData("/path1", wh, null));
    }

    public static String getChildNodeData() throws KeeperException, InterruptedException {
        return new String(zk.getData("/path1/child1", wh, null));
    }

    public static void changeNodeData() throws KeeperException, InterruptedException {
        zk.setData("/path1", "data2".getBytes(), -1);
    }

    public static void changeNodeDataAgain() throws KeeperException, InterruptedException {
        zk.setData("/path1", "data3".getBytes(), -1);
    }

    public static void deleteNode() throws KeeperException, InterruptedException {
        zk.delete("/path1", -1);
    }

    public static void close() throws InterruptedException {
        zk.close();
    }

}
