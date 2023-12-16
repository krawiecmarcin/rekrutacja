import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Wall implements CompositeBlock {
    private List<Block> blocks;

    private String color;
    private String material;

    public Wall(List<Block> blocks, String color, String material) {
        this.blocks = blocks;
        this.color = color;
        this.material = material;
    }

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }




    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>();
        for (Block block : blocks) {
            if (Objects.equals(block.getMaterial(), material)) {
                result.add(block);
            }
        }
        return result;
    }




    @Override
    public Optional<Block> findBlockByColor(String color) {

        for (Block block : blocks) {
            if (Objects.equals(block.getColor(), color)) {

                return Optional.of(block);
            }
        }
        return Optional.empty();
    }


    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public List<Block> getBlocks(){
        return blocks;
    }


    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}
