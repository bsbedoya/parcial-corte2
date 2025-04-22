import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import {IonicModule} from '@ionic/angular';

@Component({
  selector: 'app-fechayhora',
  templateUrl: './fechayhora.component.html',
  styleUrls: ['./fechayhora.component.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class FechayhoraComponent  {

    date: string = '';
    dateChange: EventEmitter<string> = new EventEmitter<string>();
    time: string = '';
    timeChange: EventEmitter<string> = new EventEmitter<string>();
    selectedDateTime: string = '';
  
    
  
    @Output() dateTimeSelected = new EventEmitter<string>();
  
    onDateTimeChange(event: any) {
      this.selectedDateTime = event.target.value;
      this.dateTimeSelected.emit(this.selectedDateTime);
}
  }


