class Solution {
public:
    /*void solve(TreeNode* root,vector<int>&ans){
        if(root==NULL){
            return;
        }
        solve(root->left,ans);
        ans.push_back(root->val);
        solve(root->right,ans);
    }*/

    vector<int> inorderTraversal(TreeNode* root) {
        
        vector<int>ans;
        if(root==NULL){
            return ans;
        }
        /*solve(root,ans);
        return ans;*/
        stack<TreeNode*>st;
        while(true){
            if(root!=NULL){
              st.push(root);
              root=root->left;
            }
            else{
                if(st.empty())break;
                root=st.top();
                st.pop();
                ans.push_back(root->val);
                root=root->right;
            }
        }
        return ans;
    }
};
