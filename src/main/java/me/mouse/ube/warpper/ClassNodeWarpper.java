package me.mouse.ube.warpper;

import org.objectweb.asm.tree.ClassNode;

public class ClassNodeWarpper extends NodeWarpper<ClassNode, ClassNode>{

	public ClassNodeWarpper(ClassNode node, ClassNode parent) {
		super(node, parent);
	}

}