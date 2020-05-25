package me.personal.controller;

import me.personal.zk.ZK;
import org.apache.zookeeper.KeeperException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zk")
public class ZKController {
    @RequestMapping("/createNode")
    public void createNode() throws KeeperException, InterruptedException {
        ZK.createNode();
    }

    @RequestMapping("/createChildNode")
    public void createChildNode() throws KeeperException, InterruptedException {
        ZK.createChildNode();
    }

    @RequestMapping("/getNodeData")
    public String getNodeData() throws KeeperException, InterruptedException {
        return ZK.getNodeData();
    }

    @RequestMapping("/getChildNodeData")
    public String getChildNodeData() throws KeeperException, InterruptedException {
        return ZK.getChildNodeData();
    }

    @RequestMapping("/changeNodeData")
    public void changeNodeData() throws KeeperException, InterruptedException {
        ZK.changeNodeData();
    }

    @RequestMapping("/changeNodeDataAgain")
    public void changeNodeDataAgain() throws KeeperException, InterruptedException {
        ZK.changeNodeDataAgain();
    }

    @RequestMapping("/deleteNode")
    public void deleteNode() throws KeeperException, InterruptedException {
        ZK.deleteNode();
    }

    @RequestMapping("/close")
    public void close() throws InterruptedException {
        ZK.close();
    }
}
