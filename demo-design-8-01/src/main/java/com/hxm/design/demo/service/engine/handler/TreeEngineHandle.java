package com.hxm.design.demo.service.engine.handler;

import com.hxm.design.demo.model.EngineResult;
import com.hxm.design.demo.model.TreeNode;
import com.hxm.design.demo.model.aggregates.TreeRich;
import com.hxm.design.demo.service.engine.EngineBase;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 决策引擎的实现
 * @author hxmao
 * @date 2022/5/11 18:13
 */
@Slf4j
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId,
                decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
