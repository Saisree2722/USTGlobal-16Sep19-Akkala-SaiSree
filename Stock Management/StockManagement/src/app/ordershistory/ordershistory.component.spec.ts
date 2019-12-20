import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrdershistoryComponent } from './ordershistory.component';

describe('OrdershistoryComponent', () => {
  let component: OrdershistoryComponent;
  let fixture: ComponentFixture<OrdershistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrdershistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrdershistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
