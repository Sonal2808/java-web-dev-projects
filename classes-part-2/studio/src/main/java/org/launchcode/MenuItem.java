package org.launchcode;

public class MenuItem {
        private String name;
        private double price;
        private String description;
        private String category;
        public boolean isNew;

        public MenuItem(String name, double price, String description, String category, boolean isNew) {
                this.name = name;
                this.price = price;
                this.description = description;
                this.category = category;
                this.isNew = isNew;
        }

        // Other methods...
        public String getName() {
                return name;
        }
        public double getPrice() {
                return price;
        }
        public String getCategory() {
                return category;
        }
       public boolean isNew(){
                return isNew;
       }
        @Override
        public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                MenuItem menuItem = (MenuItem) obj;
                return name.equals(menuItem.name);
        }

        @Override
        public int hashCode() {
                return name.hashCode();
        }


}
