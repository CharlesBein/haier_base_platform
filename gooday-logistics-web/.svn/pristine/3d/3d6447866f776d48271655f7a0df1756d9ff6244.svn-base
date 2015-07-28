package cn.gooday.logistics.web.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 定义树节点
 */
public class TreeNode implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -107439781942753760L;

	//ID
	private int id;
	
	//展示数时显示的文本
	private String text;
	
	//是否是叶子节点
	private boolean leaf;
	
	//子节点的集合
	//(@JsonInclude(Include.NON_NULL)序列化时的标记 如果为空则不参与序列化)
	//@JsonInclude(Include.NON_NULL)  
	private List<TreeNode> children;

	public TreeNode() {}
	
	public TreeNode(int id, String text, boolean leaf) {
		super();
		this.id = id;
		this.text = text;
		this.leaf = leaf;
	}

	public TreeNode(int id, String text, boolean leaf, List<TreeNode> children) {
		super();
		this.id = id;
		this.text = text;
		this.leaf = leaf;
		this.children = children;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
}