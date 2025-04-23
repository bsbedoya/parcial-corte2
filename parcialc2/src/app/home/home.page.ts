import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FechayhoraComponent } from '../fechayhora/fechayhora.component';
import { CommonModule } from '@angular/common';
import {IonicModule} from '@ionic/angular';
import { FormsModule } from '@angular/forms';
import { ClienteComponent } from '../cliente/cliente.component';



@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: true,
  imports: [FechayhoraComponent,CommonModule,IonicModule,FormsModule,ClienteComponent],
})
export class HomePage {
  
  reservation = {
    dateTime: '',
    customer: null,
    table: null,
  };
  @Input() date: string = '';
  @Output() dateChange = new EventEmitter<string>();
  
  @Input() time: string = '';
  @Output() timeChange = new EventEmitter<string>();
   
  onDateTimeSelected(dateTime: string) {
    this.reservation.dateTime = dateTime;
  }

  onCustomerDataSubmitted(customer: any) {
    this.reservation.customer = customer;
  }

}
