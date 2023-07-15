class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addLists(l2, l1, new ListNode(), 0);
    }

    private ListNode addLists(ListNode list1, ListNode list2, ListNode resultList, int carryOver) {
        if (list1 == null) {
            list1 = new ListNode();
        }
        if (list2 == null) {
            list2 = new ListNode();
        }
        int val = list1.val + list2.val + carryOver;
        carryOver = 0;
        if (val > 9) {
            carryOver = 1;
            val = val % 10;
        }
        resultList.val = val;
        if (list1.next != null || list2.next != null || carryOver != 0) {
            resultList.next = addLists(list1.next, list2.next, new ListNode(), carryOver);
        }
        return resultList;
    }
}