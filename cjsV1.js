const canvas = document.getElementById("myCanvas");
const c = canvas.getContext("2d");

class Cjs{
    constructor(){
        c.fillStyle = "white";
        c.fillRect(0,0,720,480);
        c.fillStyle = "lightgray";
        let generate = 1;
        let tx = 90 
        let ty = 100 
        for(let step = 0;step<8;step++){
            c.fillRect(tx,ty,50,50);
            tx += 70;
        }
        for(let step = 0;step<5;step++){
            ty += 70
            tx = 580
            for(let step = 0;step<8;step++){
                c.fillRect(tx,ty,50,50);
                tx -= 70;
            }
        }
    }
    clear(){
        c.fillStyle = "white";
        c.fillRect(0,0,720,480);
        c.fillStyle = "lightgray";
        let generate = 1;
        let tx = 90 
        let ty = 100 
        for(let step = 0;step<8;step++){
            c.fillRect(tx,ty,50,50);
            tx += 70;
        }
        for(let step = 0;step<5;step++){
            ty += 70
            tx = 580
            for(let step = 0;step<8;step++){
                c.fillRect(tx,ty,50,50);
                tx -= 70;
            }
        }
    }
    rect(num,color){
        c.fillStyle = color;
        if(num == 1){
            c.fillRect(90,100,50,50);
        }
        if(num == 2){
            c.fillRect(90+70,100,50,50);
        }
        if(num == 3){
            c.fillRect(90+140,100,50,50);
        }
        if(num == 4){
            c.fillRect(90+210,100,50,50);
        }
        if(num == 5){
            c.fillRect(90+280,100,50,50);
        }
        if(num == 6){
            c.fillRect(90+350,100,50,50);
        }
        if(num == 7){
            c.fillRect(90+420,100,50,50);
        }
        if(num == 8){
            c.fillRect(90+490,100,50,50);
        }
        //2
        if(num == 9){
            c.fillRect(90,100+70,50,50);
        }
        if(num == 10){
            c.fillRect(90+70,100+70,50,50);
        }
        if(num == 11){
            c.fillRect(90+140,100+70,50,50);
        }
        if(num == 12){
            c.fillRect(90+210,100+70,50,50);
        }
        if(num == 13){
            c.fillRect(90+280,100+70,50,50);
        }
        if(num == 14){
            c.fillRect(90+350,100+70,50,50);
        }
        if(num == 15){
            c.fillRect(90+420,100+70,50,50);
        }
        if(num == 16){
            c.fillRect(90+490,100+70,50,50);
        }
        //3
        if(num == 17){
            c.fillRect(90,100+140,50,50);
        }
        if(num == 18){
            c.fillRect(90+70,100+140,50,50);
        }
        if(num == 19){
            c.fillRect(90+140,100+140,50,50);
        }
        if(num == 20){
            c.fillRect(90+210,100+140,50,50);
        }
        if(num == 21){
            c.fillRect(90+280,100+140,50,50);
        }
        if(num == 22){
            c.fillRect(90+350,100+140,50,50);
        }
        if(num == 23){
            c.fillRect(90+420,100+140,50,50);
        }
        if(num == 24){
            c.fillRect(90+490,100+140,50,50);
        }
        //4
        if(num == 25){
            c.fillRect(90,100+210,50,50);
        }
        if(num == 26){
            c.fillRect(90+70,100+210,50,50);
        }
        if(num == 27){
            c.fillRect(90+140,100+210,50,50);
        }
        if(num == 28){
            c.fillRect(90+210,100+210,50,50);
        }
        if(num == 29){
            c.fillRect(90+280,100+210,50,50);
        }
        if(num == 30){
            c.fillRect(90+350,100+210,50,50);
        }
        if(num == 31){
            c.fillRect(90+420,100+210,50,50);
        }
        if(num == 32){
            c.fillRect(90+490,100+210,50,50);
        }
        //4
        if(num == 33){
            c.fillRect(90,100+280,50,50);
        }
        if(num == 34){
            c.fillRect(90+70,100+280,50,50);
        }
        if(num == 35){
            c.fillRect(90+140,100+280,50,50);
        }
        if(num == 36){
            c.fillRect(90+210,100+280,50,50);
        }
        if(num == 37){
            c.fillRect(90+280,100+280,50,50);
        }
        if(num == 38){
            c.fillRect(90+350,100+280,50,50);
        }
        if(num == 39){
            c.fillRect(90+420,100+280,50,50);
        }
        if(num == 40){
            c.fillRect(90+490,100+280,50,50);
        }
        //5
        if(num == 41){
            c.fillRect(90,100+350,50,50);
        }
        if(num == 42){
            c.fillRect(90+70,100+350,50,50);
        }
        if(num == 43){
            c.fillRect(90+140,100+350,50,50);
        }
        if(num == 44){
            c.fillRect(90+210,100+350,50,50);
        }
        if(num == 45){
            c.fillRect(90+280,100+350,50,50);
        }
        if(num == 46){
            c.fillRect(90+350,100+350,50,50);
        }
        if(num == 47){
            c.fillRect(90+420,100+350,50,50);
        }
        if(num == 48){
            c.fillRect(90+490,100+350,50,50);
        }
    }
    backGround(color){
        let pos = 1;
        for(let step = 0; step < 48;step ++){
            this.rect(pos,color);
            pos ++;
        }
    }
    text(text,x,y,color = "lightgray"){
        c.fillStyle = color;
        c.font = 'bold 24px sans serif';
        c.fillText(text,x,y);
    }
    end(){
        let end = true;
        c.fillStyle = "white";
        c.fillRect(0,0,720,500);
        while (end){
            //This code breaks the entire Js website
        }
    }
    getRandomInt(max) {
        return Math.floor(Math.random() * max);
    }
    touching(pos, oPos){
        if(pos==oPos){
            return true;
        }
        else{
            return false;
        }
    }
}