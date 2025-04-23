import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import {IonicModule} from '@ionic/angular';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class ClienteComponent  {
  customerName: string = '';
  customerLastName: string = '';
  customerEmail: string = '';
  customerPhone: string = '';
  customerType: string = '';
  customerInterests: string[] = [];
  customerComments: string = '';
  customerTermsAccepted: boolean = false;

  @Output() customerDataSubmitted = new EventEmitter<{
    name: string;
    lastName: string;
    email: string;
    phone: string;
    type: string;
    interests: string[];
    comments: string;
    termsAccepted: boolean;
  }>();

  constructor() {}

  onSubmit() {
    this.customerDataSubmitted.emit({
      name: this.customerName,
      lastName: this.customerLastName,
      email: this.customerEmail,
      phone: this.customerPhone,
      type: this.customerType,
      interests: this.customerInterests,
      comments: this.customerComments,
      termsAccepted: this.customerTermsAccepted,
    });

  
}
}