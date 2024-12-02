package test;


import java.util.HashMap;


public class Trie {
    private TrieNode root;


    public Trie() {
        root = new TrieNode();
    }


    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.getChildren();

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode node;

            if(children.containsKey(c)) {
                node = children.get(c);

            } else {
                node = new TrieNode(c);
                children.put(c, node);
            }

            children = node.getChildren();
            if(i == word.length() - 1) {
                node.setLeaf(true);
            }
        }

    }


    private createExampleTrie()  {
        Trie trie = new Trie();

        trie.insert("Programming");
        trie.insert("some");
        trie.insert("random");
        trie.insert("words");

        return trie;
    }
    public static void main(String[] args){



    }


}
