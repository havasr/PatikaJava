public class ToolStore extends NormalLocation{
    public ToolStore(Player player) {
        super(2, player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the tool store!");
        return true;
    }
}
