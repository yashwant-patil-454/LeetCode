class ProductOfNumbers {
    private List<Integer> prefixProducts;

    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            // Reset because we cannot divide a prefix product by zero
            prefixProducts.clear();
            prefixProducts.add(1);
        } else {
            // Store cumulative product of numbers since the last zero
            int lastProduct = prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProducts.size();

        // If k numbers extend before the last zero, product is zero
        if (size <= k) {
            return 0;
        }

        // Divide current prefix product by the prefix product
        // before the last k elements
        return prefixProducts.get(size - 1) / prefixProducts.get(size - 1 - k);

    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */