# Java Data Structures Library

A simple educational implementation of common data structures in Java, including:

- Singly Linked Lists
- Doubly Linked Lists
- Stack
- Queue
- Binary Tree
- Binary Search Tree (BST)

Designed for learning and practice purposes.

---

## 📁 Project Structure

```
src/
├── Data_Structures/
│   ├── Queue.java
│   └── Stack.java
├── Linked_List/
│   ├── IntList.java
│   ├── IntListTwo.java
│   ├── IntNode.java
│   └── IntNodeTwo.java
└── BinaryTree/
    ├── BT_Methods.java
    └── Node.java
```

---

## 📦 Packages and Classes

### 🔗 `Linked_List`

#### `IntNode`
A node class for singly linked lists.  
Holds an integer value and a reference to the next node.

#### `IntNodeTwo`
A node class for doubly linked lists.  
Holds an integer value and references to both the previous and next nodes.

#### `IntList`
A singly linked list implementation with the ability to:
- Add/remove elements
- Find length
- Search/predecessor
- Compare with another list
- Swap nodes (`what(k)` method)

#### `IntListTwo`
A doubly linked list with:
- `insertAfter()` – insert a node after a given one
- `rearrange()` – move all negatives to the left and positives to the right
- `enDenDino(k)` – Josephus-style circular elimination

---

### 📚 `Data_Structures`

#### `Stack`
A stack implementation (LIFO) using a singly linked list:
- `push()`, `pop()`, `top()`, `isEmpty()`
- `print()` – recursive print without losing content
- `toString()` – returns stack as string

#### `Queue`
A queue implementation (FIFO) using a singly linked list:
- `enqueue()`, `dequeue()`, `first()`, `isEmpty()`

---

### 🌳 `BinaryTree`

#### `Node`
Represents a node in a binary tree.  
Holds an integer value and references to left and right children.

#### `BT_Methods`
Provides static methods for operating on binary trees and BSTs:
- Search: `search()`, `searchInBST()`
- Traversals: `printPreOrder()`, `printInOrder()`, `printPostOrder()`
- Insert into BST: `insert()`
- Find max value in a tree: `maxInTree()`

---

## ▶️ Example Usage

```java
// Create and use a stack
Stack stack = new Stack();
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // 20

// Use a queue
Queue queue = new Queue();
queue.enqueue(5);
queue.enqueue(8);
System.out.println(queue.dequeue()); // 5

// Binary Tree
Node root = new Node(10);
BT_Methods.insert(root, 5);
BT_Methods.insert(root, 15);
BT_Methods.printInOrder(root); // 5 10 15
```

---

## 🧠 Author

**Ivgeny Tokarzhevsky**  
Developed as part of learning data structures and algorithms in Java.

---

## 📜 License

This project is open-source and available under the MIT License.
