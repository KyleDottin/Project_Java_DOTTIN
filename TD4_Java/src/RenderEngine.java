    import javax.swing.*;
    import java.awt.*;
    import java.util.ArrayList;
    import java.util.List;

    public class RenderEngine extends JPanel implements Engine {
        protected List<Displayable> renderList;

        public RenderEngine() {
            this.renderList = new ArrayList<Displayable>();
        }

        public void addTorenderList(Displayable displayable) {
            this.renderList.add(displayable);
        }

        public void clearRenderList() {
            this.renderList.clear();
        }


        @Override
        public void paint(Graphics g){
            super.paint(g);
            for (Displayable element : renderList){
                element.Draw(g);
            }
        }

        @Override
        public void update(){
            this.repaint();
        }

    }

